package HoodedBots.TerranEmpire;

import java.awt.Color;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {

	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] command = event.getMessage().getContent().split("");
     // String message = event.getMessage().getContent();
		
		if(!command[0].startsWith(Ref.PREFIX))
			return;

		

		if(event.getMessage().getContent().equalsIgnoreCase("/help")) {
       	    event.getMessage().delete().complete();

			EmbedBuilder eb = new EmbedBuilder();
			
    		eb.setTitle(null , null);
			eb.setColor(Color.CYAN);
    		eb.setDescription(null);
    		eb.addField("__Help__", "**/Help** - Displays this message.", true);
    		eb.addField("__Credits:__", "**/Credits** - Shows the information of the people who coded this bot.", true);
    		eb.setAuthor("Terran Empire Help Manual", null, "https://i.imgur.com/Uz8k7m1.png");
    		eb.setFooter("Created by Team Hooded", null);
    		eb.setImage(null);
    		eb.setThumbnail(null);
    		
			event.getChannel().sendMessage(eb.build()).queue(); 
            
        		System.out.println("\n-------------------------------");
        		System.out.println(event.getAuthor().getName() + " Just ran '" + event.getMessage().getContent() + "'!");
        		System.out.println("-------------------------------\n");
        		
			} else {
    		}
		
	if(event.getMessage().getContent().equalsIgnoreCase("/credits")) {
       	    event.getMessage().delete().complete();
			EmbedBuilder eb = new EmbedBuilder();
    		eb.setTitle(null , null);
			eb.setColor(Color.CYAN);
    		eb.setDescription(null);
    		eb.addField("\n__Team Hooded:__", "<@233003081632186368> \n\n <@142403954632818688>", true);
    		eb.setAuthor("My Creators", null, "https://i.imgur.com/Uz8k7m1.png");
    		eb.setFooter("Created by Team Hooded", null);
    		eb.setImage(null);
    		eb.setThumbnail(null);
    		
			event.getChannel().sendMessage(eb.build()).queue(); 
    		System.out.println("\n-------------------------------------");
    		System.out.println(event.getAuthor().getName() + " Just ran '" + event.getMessage().getContent() + "'!");
    		System.out.println("-------------------------------\n");
  	
	} else {
	}

	if(event.getMessage().getContent().equalsIgnoreCase("/team")) {
       	    event.getMessage().delete().complete();
			EmbedBuilder eb = new EmbedBuilder();
    		eb.setTitle("About Team Hooded" , null);
			eb.setColor(Color.CYAN);
    		eb.setDescription("Team Hooded is a Discord Bots / Minecraft Development team.");
    		eb.addField("Lead-Developer", "<@233003081632186368>", true);
    		eb.addField("Manager", "<@142403954632818688>", true);
    		eb.setAuthor("Team Hooded", null, "https://i.imgur.com/Uz8k7m1.png");
    		eb.setFooter("HoodedEvents © HoodedBots 2017", null);
    		eb.setImage(null);
    		eb.setThumbnail(null);
    		
			event.getChannel().sendMessage(eb.build()).queue(); 
        
    		System.out.println("\n-------------------------------");
    		System.out.println(event.getAuthor().getName() + " Just ran '" + event.getMessage().getContent() + "'!");
    		System.out.println("-------------------------------\n");
    		
    	} else {
    	}


	if(event.getMessage().getContent().equalsIgnoreCase("/events")) {
       	    event.getMessage().delete().complete();
			EmbedBuilder eb = new EmbedBuilder();
		
    		eb.setTitle(null , null);
			eb.setColor(Color.CYAN);
    		eb.setDescription(null);
    		eb.addField("__Comming soon:__", "**Undefinded Variable detected** - Command is comming soon.", true);
    		eb.setAuthor("Events", null, "https://i.imgur.com/Uz8k7m1.png");
    		eb.setFooter("Created by Team Hooded", null);
    		eb.setImage(null);
    		eb.setThumbnail(null);
    		
			event.getChannel().sendMessage(eb.build()).queue(); 
		
    		System.out.println("\n-------------------------------");
    		System.out.println(event.getAuthor().getName() + " Just ran '" + event.getMessage().getContent() + "'!");
    		System.out.println("-------------------------------\n");
    		
    	} else {
    	}


	if(event.getMessage().getContent().equalsIgnoreCase("/event start")) {
       	    event.getMessage().delete().complete();
          	 
       	    EmbedBuilder eb = new EmbedBuilder();
    		eb.setTitle(null , null);
			eb.setColor(Color.CYAN);
    		eb.setDescription(null);
    		eb.addField("Events", "**Undefinded Variable detected** - Command is comming soon.", true);
    		eb.setAuthor(command[3], null, "https://i.imgur.com/Uz8k7m1.png");
    		eb.setFooter("Created by Team Hooded", null);
    		eb.setImage(null);
    		eb.setThumbnail(null);
    		
			event.getChannel().sendMessage(eb.build()).queue(); 
        
    		System.out.println("\n-------------------------------");
    		System.out.println(event.getAuthor().getName() + " Just ran '" + event.getMessage().getContent() + "'!");
    		System.out.println("-------------------------------\n");
    		
    	} else {
    	}

			
 		}
	}
