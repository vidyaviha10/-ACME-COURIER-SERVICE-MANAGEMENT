package distance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class calculateDistance {
	
	public static calculateDistance cal = new calculateDistance();

    private List<Vertex> nodes;
    private List<Edge> edges;
    
    private List<Edge> edgesEffective;
    
    private Map<String,Integer> intersection;
    
    public LinkedHashMap<String,String> lanes;
    
    public calculateDistance()
    {
    	nodes = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
        edgesEffective = new ArrayList<Edge>();
        
        intersection = new HashMap<>();
        
        lanes = new LinkedHashMap<>();
        
/*        intersection.put("A1", 0);
        intersection.put("A2", 1);
        intersection.put("A3", 2);
        intersection.put("A4", 3);
        intersection.put("A5", 4);
        intersection.put("A6", 5);
        intersection.put("A7", 6);
        
        intersection.put("B1", 7);
        intersection.put("B1", 7);
        intersection.put("B1", 7);
        intersection.put("B1", 7);
        intersection.put("B1", 7);
        intersection.put("B1", 7);
        intersection.put("B1", 7);*/
        
        for (int i = 1; i <= 7; i++) {
            Vertex location = new Vertex("A" + i, "A" + i);
            intersection.put("A" + i, i-1);
            nodes.add(location);
        }
        
        for (int i = 1; i <= 7; i++) {
            Vertex location = new Vertex("B" + i, "B" + i);
            intersection.put("B" + i, 7+i-1);
            nodes.add(location);
        }
        
        for (int i = 1; i <= 7; i++) {
            Vertex location = new Vertex("C" + i, "C" + i);
            intersection.put("C" + i, 14+i-1);
            nodes.add(location);
        }
        
        for (int i = 1; i <= 7; i++) {
            Vertex location = new Vertex("D" + i, "D" + i);
            intersection.put("D" + i, 21+i-1);
            nodes.add(location);
        }
        
        for (int i = 1; i <= 7; i++) {
            Vertex location = new Vertex("E" + i, "E" + i);
            intersection.put("E" + i, 28+i-1);
            nodes.add(location);
        }
        
        for (int i = 1; i <= 7; i++) {
            Vertex location = new Vertex("F" + i, "F" + i);
            intersection.put("F" + i, 35+i-1);
            nodes.add(location);
        }
        
        for (int i = 1; i <= 7; i++) {
            Vertex location = new Vertex("G" + i, "G" + i);
            intersection.put("G" + i, 42+i-1);
            nodes.add(location);
        }

        addLane("Edge_0", 0, 1, 1);
        addLane("Edge_1", 1, 2, 1);  
        addLane("Edge_2", 2, 3, 1);
        addLane("Edge_3", 3, 4, 1);
        addLane("Edge_4", 4, 5, 1);
        addLane("Edge_5", 5, 6, 1);
        
        lanes.put("A1-A2", "Edge_0");
        lanes.put("A2-A3", "Edge_1");
        lanes.put("A3-A4", "Edge_2");
        lanes.put("A4-A5", "Edge_3");
        lanes.put("A5-A6", "Edge_4");    
        lanes.put("A6-A7", "Edge_5");
        
        
        
        addLane("Edge_6", 1, 8, 1);
        addLane("Edge_7", 3, 10, 1);
        addLane("Edge_8", 5, 12, 1);
        
        
        lanes.put("A2-B2", "Edge_6");
        lanes.put("A4-B4", "Edge_7");
        lanes.put("A6-B6", "Edge_8");
        
        //B
        
        
        addLane("Edge_9", 7, 0, 1);
        addLane("Edge_10", 8, 1, 1);
        addLane("Edge_11", 9, 2, 1);
        addLane("Edge_12", 11, 4, 1);
        addLane("Edge_13", 12, 5, 1);
        addLane("Edge_14", 13, 6, 1);
        
        lanes.put("B1-A1", "Edge_9");
        lanes.put("B2-A2", "Edge_10");
        lanes.put("B3-A4", "Edge_11");
        lanes.put("B5-A5", "Edge_12");
        lanes.put("B6-A6", "Edge_13");
        lanes.put("B7-A7", "Edge_14");
        
        
        addLane("Edge_15", 8, 15, 1);
        addLane("Edge_16", 10, 17, 1);
        addLane("Edge_17", 12, 19, 1);
        
        lanes.put("B2-C2", "Edge_15");
        lanes.put("B4-C4", "Edge_16");
        lanes.put("B6-C6", "Edge_17");
        
        
        addLane("Edge_18", 8, 7, 1);
        addLane("Edge_19", 9, 8, 1);
        addLane("Edge_20", 10, 9, 1);
        addLane("Edge_21", 11, 10, 1);
        addLane("Edge_22", 12, 11, 1);
        addLane("Edge_23", 13, 12, 1);
        
        lanes.put("B2-B1", "Edge_18");
        lanes.put("B3-B2", "Edge_19");
        lanes.put("B4-B3", "Edge_20");
        lanes.put("B5-B4", "Edge_21");
        lanes.put("B6-B5", "Edge_22");
        lanes.put("B7-B6", "Edge_23");
        
        //c
        
        addLane("Edge_24", 15, 22, 1);
        addLane("Edge_25", 17, 24, 1);
        addLane("Edge_26", 19, 26, 1);
        
        lanes.put("C2-D2", "Edge_24");
        lanes.put("C4-D4", "Edge_25");
        lanes.put("C6-D6", "Edge_26");
        
        addLane("Edge_27", 14, 15, 1);
        addLane("Edge_28", 15, 16, 1);
        addLane("Edge_29", 16, 17, 1);
        addLane("Edge_30", 17, 18, 1);
        addLane("Edge_31", 18, 19, 1);
        addLane("Edge_32", 19, 20, 1);
        
        lanes.put("C1-C2", "Edge_27");
        lanes.put("C2-C3", "Edge_28");
        lanes.put("C3-C4", "Edge_29");
        lanes.put("C4-C5", "Edge_30");
        lanes.put("C5-C6", "Edge_31");
        lanes.put("C6-C7", "Edge_32");
        
        addLane("Edge_33", 14, 7, 1);
        addLane("Edge_35", 15, 8, 1);
        addLane("Edge_36", 16, 9, 1);
        addLane("Edge_37", 18, 11, 1);
        addLane("Edge_38", 19, 12, 1);
        addLane("Edge_39", 20, 13, 1);
        
        lanes.put("C1-B1", "Edge_33");
        lanes.put("C2-B2", "Edge_35");
        lanes.put("C3-B3", "Edge_36");
        lanes.put("C5-B5", "Edge_37");
        lanes.put("C6-B6", "Edge_38");
        lanes.put("C8-B7", "Edge_39");
        
        //d
        addLane("Edge_40", 21, 22, 1);
        addLane("Edge_41", 22, 21, 1);
        addLane("Edge_42", 23, 22, 1);
        addLane("Edge_43", 22, 23, 1);
        addLane("Edge_44", 24, 23, 1);
        addLane("Edge_45", 23, 24, 1);
        addLane("Edge_46", 25, 24, 1);
        addLane("Edge_47", 24, 25, 1);
        addLane("Edge_48", 26, 25, 1);
        addLane("Edge_49", 25, 26, 1);
        addLane("Edge_50", 26, 27, 1);
        addLane("Edge_51", 27, 26, 1);
        
        lanes.put("D1-D2", "Edge_40");
        lanes.put("D2-D1", "Edge_41");
        lanes.put("D3-D2", "Edge_42");
        lanes.put("D2-D3", "Edge_43");
        lanes.put("D4-D3", "Edge_44");
        lanes.put("D3-D4", "Edge_45");
        lanes.put("D5-D4", "Edge_46");
        lanes.put("D4-D5", "Edge_47");
        lanes.put("D6-D5", "Edge_48");
        lanes.put("D5-D6", "Edge_49");
        lanes.put("D6-D7", "Edge_50");
        lanes.put("D7-D6", "Edge_51");
        
        addLane("Edge_52", 22, 29, 1);
        addLane("Edge_53", 24, 31, 1);
        addLane("Edge_54", 26, 33, 1);
        
        lanes.put("D2-E2", "Edge_52");
        lanes.put("D4-E4", "Edge_53");
        lanes.put("D6-E6", "Edge_54");
        
        addLane("Edge_55", 21, 14, 1);
        addLane("Edge_56", 22, 15, 1);
        addLane("Edge_57", 23, 16, 1);
        addLane("Edge_58", 25, 18, 1);
        addLane("Edge_59", 26, 19, 1);
        addLane("Edge_60", 27, 20, 1);
        
        lanes.put("D1-C1", "Edge_55");
        lanes.put("D2-C2", "Edge_56");
        lanes.put("D3-C3", "Edge_57");
        lanes.put("D5-C5", "Edge_58");
        lanes.put("D6-C6", "Edge_59");
        lanes.put("D7-C7", "Edge_60");
        
        //E
        
        addLane("Edge_61", 28, 29, 1);
        addLane("Edge_62", 29, 30, 1);
        addLane("Edge_63", 30, 31, 1);
        addLane("Edge_64", 31, 32, 1);
        addLane("Edge_65", 32, 33, 1);
        addLane("Edge_66", 33, 34, 1);
        
        lanes.put("E1-E2", "Edge_61");
        lanes.put("E2-E3", "Edge_62");
        lanes.put("E3-E4", "Edge_63");
        lanes.put("E4-E5", "Edge_64");
        lanes.put("E5-E6", "Edge_65");
        lanes.put("E6-E7", "Edge_66");
        
        
        addLane("Edge_67", 28, 21, 1);
        addLane("Edge_68", 29, 22, 1);
        addLane("Edge_69", 30, 23, 1);
        addLane("Edge_70", 32, 25, 1);
        addLane("Edge_71", 33, 26, 1);
        addLane("Edge_72", 34, 27, 1);
        
        lanes.put("E1-D1", "Edge_67");
        lanes.put("E2-D2", "Edge_68");
        lanes.put("E3-D3", "Edge_69");
        lanes.put("E5-D5", "Edge_70");
        lanes.put("E6-D6", "Edge_71");
        lanes.put("E7-D7", "Edge_72");
        
        addLane("Edge_73", 29, 36, 1);
        addLane("Edge_74", 31, 38, 1);
        addLane("Edge_75", 33, 40, 1);
        
        lanes.put("E2-F2", "Edge_73");
        lanes.put("E4-F4", "Edge_74");
        lanes.put("E6-F6", "Edge_75");
        
        //F
        
        addLane("Edge_76", 35, 28, 1);
        addLane("Edge_77", 36, 29, 1);
        addLane("Edge_78", 37, 30, 1);
        addLane("Edge_79", 39, 32, 1);
        addLane("Edge_80", 40, 33, 1);
        addLane("Edge_81", 41, 34, 1);
        
        lanes.put("F1-E1", "Edge_76");
        lanes.put("F2-E2", "Edge_77");
        lanes.put("F3-E3", "Edge_78");
        lanes.put("F5-E5", "Edge_79");
        lanes.put("F6-E6", "Edge_80");
        lanes.put("F7-E7", "Edge_81");
        
        addLane("Edge_82", 36, 35, 1);
        addLane("Edge_83", 37, 36, 1);
        addLane("Edge_84", 38, 37, 1);
        addLane("Edge_85", 39, 38, 1);
        addLane("Edge_86", 40, 39, 1);
        addLane("Edge_87", 41, 40, 1);
        
        lanes.put("F2-F1", "Edge_82");
        lanes.put("F3-F2", "Edge_83");
        lanes.put("F4-F3", "Edge_84");
        lanes.put("F5-F4", "Edge_85");
        lanes.put("F6-F5", "Edge_86");
        lanes.put("F7-F6", "Edge_87");
       

        addLane("Edge_88", 36, 43, 1);
        addLane("Edge_89", 38, 45, 1);
        addLane("Edge_90", 40, 47, 1);
        
        lanes.put("F2-G2", "Edge_88");
        lanes.put("F4-G4", "Edge_89");
        lanes.put("F6-G6", "Edge_90");
        
        //G
        
        addLane("Edge_91", 42, 35, 1);
        addLane("Edge_92", 43, 36, 1);
        addLane("Edge_93", 44, 37, 1);
        addLane("Edge_94", 46, 39, 1);
        addLane("Edge_95", 47, 40, 1);
        addLane("Edge_96", 48, 41, 1);
        
        lanes.put("G1-F1", "Edge_91");
        lanes.put("G2-F2", "Edge_92");
        lanes.put("G3-F3", "Edge_93");
        lanes.put("G5-F5", "Edge_94");
        lanes.put("G6-F6", "Edge_95");
        lanes.put("G7-F7", "Edge_96");
        
        addLane("Edge_97", 42, 43, 1);
        addLane("Edge_98", 43, 44, 1);
        addLane("Edge_99", 44, 45, 1);
        addLane("Edge_100", 45, 46, 1);
        addLane("Edge_101", 46, 47, 1);
        addLane("Edge_102", 47, 48, 1);
        
        lanes.put("G1-G2", "Edge_97");
        lanes.put("G2-G3", "Edge_98");
        lanes.put("G3-G4", "Edge_99");
        lanes.put("G4-G5", "Edge_100");
        lanes.put("G5-G6", "Edge_101");
        lanes.put("G6-G7", "Edge_102");
        
        for(Edge lane: edges)
        {
        	edgesEffective.add(lane);
        }
        
        
        //A
       
    }
    
    public void blockLane(String edge)
    {int index = -1;
    for(int i =0;i<edgesEffective.size();i++)
    {
    	if(edgesEffective.get(i).getId().equals(edge))
    	{
    		index = i;
    		break;
    	}
    }
    if(index!=-1)
    {
    	edgesEffective.remove(index);
    }
    	
    }
    
    public void unBlockLane(String edge)
    {
    	boolean flag = true;
    	for(int i =0;i<edgesEffective.size();i++)
	    {
		 
	    	if(edgesEffective.get(i).getId().equals(edge))
	    	{
	    		flag = false;
	    		break;
	    	}
	    }
    	
    	if(flag)
    	{
    		for(int i =0;i<edges.size();i++)
    	    {
    		 
    	    	if(edges.get(i).getId().equals(edge))
    	    	{
    	    		edgesEffective.add(edges.get(i));
    	    		break;
    	    	}
    	    }
    	}
    	 
    }


    public String calculate(String intersect1,String intersect) {
        String direction ="";
        
        if(intersection == null)
        {
        	cal = new calculateDistance();
        }
        
        int delivery = intersection.get(intersect);
        int starting = intersection.get(intersect1);
        
        
        System.out.println("starting: "+starting+" delivery: "+delivery);
        // Lets check from location Loc_1 to Loc_10
        Graph graph = new Graph(nodes, edgesEffective);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        dijkstra.execute(nodes.get(starting));
        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(delivery));

   if(path == null || path.equals(""))
   {
	   direction = "no path";
   }
   else
   {
	   for (Vertex vertex : path) {
           System.out.println(vertex);
           if(direction.equals(""))
           {
           	direction = vertex.toString();
           }
           else
           {
           direction = direction+"-->"+vertex.toString();
           }
       }
	   
   }
       
        
        return direction;

    }

    private void addLane(String laneId, int sourceLocNo, int destLocNo,
            int duration) {
        Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), duration );
        edges.add(lane);
    }
    
    public static void main(String[] a)
    {
    	calculateDistance c = new calculateDistance();
    	for(Map.Entry<String, Integer> entry:c.intersection.entrySet())
    	{
    		System.out.println(entry.getKey()+","+entry.getValue());
    	}
    }
}

