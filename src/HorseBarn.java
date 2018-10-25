//Alexander Cox
//Monday, October 22, 2018

public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] horses)
    {
        this.spaces = horses;
    }

    public int findHorseSpace(String name)
    {
        for (int i = 0; i < this.spaces.length; i++)
        {
            if (this.spaces[i] != null && this.spaces[i].getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }

    public void consolidate()
    {
        for (int i = 0; i < this.spaces.length; i++)
        {
            if (this.spaces[i] == null)
            {
                for (int x = i; x <this.spaces.length; x++)
                {
                    if (this.spaces[x] != null)
                    {
                        this.spaces[i] = this.spaces[x];
                        this.spaces[x] = null;
                        break;
                    }
                }
            }
        }
    }
}