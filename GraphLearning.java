import java.util.*;   // started from 11:58 AM (14-05-2024)
class GraphLearning{
public static class Node{
char data; Node next;
Node(char datas){
data= datas;
next= null;
}
}
public static void build(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of nodes?");
int numberOfNodes= sc.nextInt();
Node[] graph= new Node[numberOfNodes];
sc.nextLine();
for(int i=0;i<numberOfNodes; i++){
System.out.println("Enter the node.");
char element= sc.nextLine().charAt(0);
Node node= new Node(element);
graph[i] = node;
}

for(int i=0; i<numberOfNodes-1; i++){
Node temp= graph[i];
for(int j=i+1; j<numberOfNodes; j++){
System.out.println("Is "+temp.data+" is connected to " +graph[j].data+". If yes, then press 1 otherwise 0.");
int choice= sc.nextInt();
if(choice==1){
Node node = new Node(graph[j].data);
node.next= graph[i].next;
graph[i].next= node;
Node node1= new Node(graph[i].data);
node1.next= graph[j].next;
graph[j].next= node1;
      }  
   }
}
for(int i=0; i<graph.length; i++){
System.out.print(graph[i].data +" is connected with: ");
Node temp= graph[i].next;
while(temp!=null){
System.out.print(temp.data+" ");
temp= temp.next;
    }
System.out.println();
  } 
}
public static void main(String args[]){
build();
}
}   