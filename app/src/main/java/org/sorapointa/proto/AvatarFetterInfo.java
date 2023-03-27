package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarFetterInfo {
    @Tag(tag=1) public Integer expNumber = null;
    @Tag(tag=2) public Integer expLevel = null;
    @Tag(tag=3) public List<Integer> openIdList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> finishIdList = new ArrayList<>();
    @Tag(tag=5) public List<Integer> rewardedFetterLevelList = new ArrayList<>();
    @Tag(tag=6) public List<FetterData> fetterList = new ArrayList<>();
}
