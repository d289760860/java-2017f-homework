package javaH2;

public class Snake extends creature{
	String name;
	public Snake()
	{
		super();
	}
	public Snake(String name)
	{
		this.name=name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPos(int x,int y)
	{
		Pos.setX(x);
		Pos.setY(y);
		Pos.setMaster(this);
	}
	
	public void enterField(field A)
	{
		A.place[Pos.getX()][Pos.getY()].setMaster(this);
		
	}
	public String Tell()
	{
		return this.name;
	}
}
