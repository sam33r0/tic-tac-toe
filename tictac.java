import java.util.*;
class tictac
{
	public static void main(String arg[])
	{
		int d[][]={{1,2,3},{1,5,9},{1,4,7},{2,5,8},{3,6,9},{3,5,7},{4,5,6},{7,8,9}};
		int m=0,ptr=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("\tHELLO!");
		System.out.println("\n*****Tic Tac Toe*****\n");
		char ar[]={'1','2','3','4','5','6','7','8','9'};
		char ap[]={'X','O','X','O','X','O','X','O','X'};
		int cp[]=new int[6];
		int dc[]=new int[6];

		int p=0;
		for(int i=0;i<3;i++)
		{
			if(i==2)
			{
					System.out.print("  X  |  O  |  X");
					break;
			}
			System.out.print("__");
			for(int j=0;j<3;j++)
			{
				if(j==2)
				System.out.print(ap[p]+"__");
				else
				{
				System.out.print(ap[p]+"__|__");
				}


				p++;

			}
			System.out.println("");
		}
		p=0;

		char ch=' ';
		while(ch!='X' && ch!='O' && ch!='0' && ch!='x' && ch!='o')
		{
			if(ch!=' ')
			{
				System.out.println("Wrong choice");
			}
			System.out.println("\nchoose X or O");
			ch=ob.nextLine().charAt(0);
		}
		System.out.println("to play enter the no. you want to write "+ch+" in the below gievn figure");
		for(int i=0;i<3;i++)
					{
						if(i==2)
						{
							System.out.print("  "+ar[p]+"  |  "+ar[p+1]+"  |  "+ar[p+2]);
							break;
						}
						System.out.print("__");
						for(int j=0;j<3;j++)
						{
							if(j==2)
							System.out.print(ar[p]+"__");
							else
							{
								System.out.print(ar[p]+"__|__");
							}


							p++;

						}
						System.out.println("");
					}
					p=0;

		int arr[]={1,2,3,4,5,6,7,8,9};
		int c=0,pq=0;
		while(c!=1)
		{
			System.out.println("\nenter any no.");
			int ip=ob.nextInt();
			m++;
			while(ar[ip-1]!=(arr[ip-1]+48))
			{
				if(ar[ip-1]!=arr[ip-1])
				{
					System.out.println("wrong input");
					System.out.println("enter any no. ");
					ip=ob.nextInt();
				}

			}
			cp[ptr]=ip;
			int mc=0;
			int cm=0,t=0;
			for(int i=0;i<8;i++)
			{
				mc=0;
				t=0;
				for(int j=0;j<3;j++)
				{
					for(t=0;t<6;t++)
					{
						if(d[i][j]==cp[t]){
						mc++;}
						else
						cm=j;
					}
				}
				if(mc>=2)
				{
					mc=i;
					break;
				}
			}
			for(int i=0;i<8;i++)
			{
				int lb=0;
				for(int j=0;j<ptr;j++)
				{
					if(dc[j]==d[mc][cm])
					lb++;
				}
				if(lb==0)
				{
					if(m>=5)
					break;
					pq=d[mc][cm];
					if(ar[pq-1]==(arr[pq-1]+48) && pq!=ip)
					break;
				}
				else
				{
					if(m>=5)
					break;
					pq=(int)(Math.random()*10);
					if(pq>0)
					{
						if(ar[pq-1]==(arr[pq-1]+48) && pq!=ip)
						break;
					}
				}
			}
			dc[ptr]=pq;
			ptr++;
			ar[ip-1]=ch;
			if(ch=='X' || ch=='x')
			ar[pq-1]='O';
			else
			ar[pq-1]='X';
			p=0;
			for(int i=0;i<3;i++)
			{
				if(i==2)
				{
					System.out.print("  "+ar[p]+"  |  "+ar[p+1]+"  |  "+ar[p+2]);
					break;
				}
				System.out.print("__");
				for(int j=0;j<3;j++)
				{
					if(j==2)
					System.out.print(ar[p]+"__");
					else
					{
						System.out.print(ar[p]+"__|__");
					}


					p++;

				}
				System.out.println("");
			}
			System.out.println();
			p=0;
			if(ar[0]==ar[1] && ar[0]==ar[2])
			{
				if(ch==ar[0])
				{
					System.out.println("you won" );
				}
				else
				System.out.println("you lost");
				c=1;
			}
			else if(ar[0]==ar[3] && ar[0]==ar[6])
			{
				if(ch==ar[0])
				{
					System.out.println("you won" );
				}
				else
				System.out.println("you lost");
				c=1;
			}

			else if(ar[0]==ar[4] && ar[0]==ar[8])
			{
				if(ch==ar[0])
				{
					System.out.println("you won" );
				}
				else
				System.out.println("you lost");
				c=1;
			}
			else if(ar[1]==ar[4] && ar[1]==ar[7])
			{
				if(ch==ar[1])
				{
					System.out.println("you won" );
				}
				else
				System.out.println("you lost");
				c=1;
			}
			else if(ar[2]==ar[5] && ar[2]==ar[8])
			{
				if(ch==ar[2])
				{
					System.out.println("you won" );
				}
				else
				System.out.println("you lost");
				c=1;
			}
			else if(ar[2]==ar[4] && ar[2]==ar[6])
			{
				if(ch==ar[2])
				{
					System.out.println("you won" );
				}
				else
				System.out.println("you lost");
				c=1;
			}
			else if(ar[3]==ar[4] && ar[3]==ar[5])
			{
				if(ch==ar[3])
				{
					System.out.println("you won" );
				}
				else
				System.out.println("you lost");
				c=1;
			}
			else if(ar[6]==ar[7] && ar[6]==ar[8])
			{
				if(ch==ar[6])
				{
					System.out.println("you won" );
				}
				else
				System.out.println("you lost");
				c=1;
			}
			if(m>=5 && c!=1)
			{
			System.out.println("its a tie game");
			break;
			}

		}
	}
}
