package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetScenePointRsp {
    @Tag(tag=11) public List<Integer> notExploredDungeonEntryList = new ArrayList<>();
    @Tag(tag=15) public List<Integer> toBeExploreDungeonEntryList = new ArrayList<>();
    @Tag(tag=2) public List<Integer> lockedPointList = new ArrayList<>();
    @Tag(tag=5) public List<Integer> unhidePointList = new ArrayList<>();
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer belongUid = null;
    @Tag(tag=13) public List<Integer> unlockedPointList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> unlockAreaList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> hidePointList = new ArrayList<>();
    @Tag(tag=14) public Integer sceneId = null;
    @Tag(tag=6) public List<Integer> notInteractDungeonEntryList = new ArrayList<>();
    @Tag(tag=10) public List<Integer> groupUnlimitPointList = new ArrayList<>();
}
