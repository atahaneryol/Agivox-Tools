package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

import Objects.Channel;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Runner {
	
	public static String appendZeros(String given)
    {
        String res = given;
        for(int i = given.length(); i < 20; i ++)
        {
            res = "0" + res;
        }
        return res;
    }

	public static void main(String[] args) throws JsonParseException, JsonMappingException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES); //There are plenty of unused fields
		
		ArrayList<String> channelIDList = new ArrayList<String>();
        channelIDList.add("00000000000000902073");  //To do: add method that appends zeros.
        channelIDList.add("00004733798597001216");
        //channelIDList.add("000047337t8597001216");
        
        String urlString = "http://54.236.95.163:5984/agivox_rsslinks/" + channelIDList.get(1);
        URL temUr = new URL(urlString);
        Channel ch1 = new Channel();
        try
        {
        	ch1 = (Channel) mapper.readValue(temUr,Channel.class);
        }catch(Exception e )
        {
        	if(e instanceof java.io.FileNotFoundException)
        	{
        		System.out.println("Hey we defined the exception!");
        	}
        		
        	e.printStackTrace();
        	System.out.println(e.getClass());
        	System.out.println("Cause " + e.getCause());
        }
        
		
		System.out.println(ch1.get_id());
		System.out.println(ch1.getTempo());
		System.out.println(ch1.getHomelink());
		
		System.out.println("Ata Test for github");
		
        Map<String,Object> docMap = mapper.convertValue(ch1,Map.class);
        System.out.println(docMap);
        
        String s = "abcd";
        System.out.println(appendZeros(s));
        System.out.println(s);
        

		
	}

}
