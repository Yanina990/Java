package com.company;

public class Tree {
    private List leaves;
    private Branch branchs;
    private String name;

    public Tree(String name){
        this.name = name;
        this.leaves=new List();
        this.branchs=new Branch();
    }

    public void bloom(){
        System.out.println("Дерево "+ name + " цветет");
    }

    public void throwTheLeaves(){
        System.out.println("Дерево "+ name + " скинуло листья");
        leaves.fall();
    }

    public void coveredWithIny(){
        System.out.println("Дерево "+ name + " покрылось инием");
        branchs.iny();
    }

    public void becomeYellow(){
        System.out.println("Дерево "+ name + " пожелтело");
        leaves.yellow();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        if(!leaves.equals(tree.leaves)) return false;
        if(!branchs.equals(tree.branchs)) return false;
        return name.equals(tree.name);
    }

    @Override
    public int hashCode() {
        int rlist = leaves.hashCode();
        int rbranch = branchs.hashCode();
        return (int)(31 * rlist + rbranch + ((name == null) ? 0 : name.hashCode()));
    }

    @Override
    public String toString(){
        return "Дерево: '" + name +"'";
    }
}
