package timetab;
import java.util.Scanner;
public class timetab {
	public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			int i,sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of subjects");
			int subn=sc.nextInt();
			String s[]=new String[subn];
			int k[]=new int[subn];
			System.out.println("enter the subjects:");
			for(i=0;i<subn;i++) 
			{
				 s[i]=sc.next();
			}
			System.out.println("enter the credits for each subject:");
			for(i=0;i<subn;i++) 
			{
				k[i]=sc.nextInt();
				sum=sum+k[i];
			}
			System.out.println("sum of credits:"+sum);
			String arr[]=new String[sum];
			int a=0;
			int b=0;
			while(b<sum && a<subn)
			{
				//System.out.println("sum of c:"+sum);
				if(k[a]!=0)
				{
					arr[b]=s[a];
					System.out.print(arr[b]);
					
					k[a]--;
					b++;
				}
				if(k[a]==0)
					a++;
			}
			System.out.println();
			int z=0;
			String array2d[][]=new String[7][5];
			for(int x=0;x<7;x++)
			{
			for(int y=0;y<5;y++)
				//System.arraycopy(arr,(y*5),array2d[y],0,5);
				{
				if(z<sum)
					array2d[x][y]=arr[z];
					System.out.print(array2d[x][y]+" ");
					z++;
				}
			System.out.println();
			}
	}
	}



