package com.afeng.pojo;

/**
 * @author afeng
 * @date 2018/9/25 20:26
 **/
public class Role
{
    private int id;
    private String rolename;
    private String note;

    @Override
    public String toString()
    {
        return "Role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getRolename()
    {
        return rolename;
    }

    public void setRolename(String rolename)
    {
        this.rolename = rolename;
    }

    public String getNote()
    {
        return note;
    }

    public void setNote(String note)
    {
        this.note = note;
    }
}
