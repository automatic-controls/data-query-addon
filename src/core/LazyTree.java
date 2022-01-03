package core;
import java.util.*;
import com.controlj.green.addonsupport.access.*;
import com.controlj.green.addonsupport.access.node.*;
public class LazyTree {
  private Location loc = null;
  private Node node = null;
  private ArrayList<LazyTree> children = null;
  private LazyTree parent = null;
  public LazyTree(Node n){
    node = n;
  }
  public LazyTree(Location l){
    loc = l;
    node = l.toNode();
  }
  public void reset(){
    children = null;
    refresh();
  }
  public void refresh(){
    //TODO - null out everything except children, loc, node, and parent
    if (children!=null){
      for (LazyTree child:children){
        child.refresh();
      }
    }
    if (parent==null){
      System.gc();
    }
  }
  public boolean setTree(Tree tree){
    try{
      loc = node.resolveToLocation(tree);
      return true;
    }catch(Exception e){
      return false;
    }
  }
  public ArrayList<LazyTree> getChildren(){
    if (children==null){
      if (loc!=null){
  
      }

    }
    return children;
  }
}
/*

  only nodes can be modified, so try to avoid using aspects if at all possible

  think about using look-aheads for the alarm source matchers

  when you come across an ID element in a matcher, set it to null immediately
  then when matches are found, reset ID to each match

  for caching data client-side, keep a record of node value dependencies so that
  the client gui can be updated without talking to the server

  lazily populate/cache tree data as its needed by the matchers
  do not ever try to get the same data twice unless explicitly refreshed by user

  dataConst IDs can be given as relative paths with forward slash separator where /~/ jumps to parent, the first element can be empty (use the current node), or an ID for another node
    TrendSource && (BTRN || !230) && (child.trend_log || child.historical_trending_enable)
  since we must reference it later, define a variable constant equal to
    BTRN && 230 || SetPoint || SetPointAdjust || PhysicalPoint || 286 || 287 || 213 && parent.289

  

*/