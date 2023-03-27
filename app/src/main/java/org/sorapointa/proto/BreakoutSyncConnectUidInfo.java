package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BreakoutSyncConnectUidInfo {
    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=2) public List<Integer> skillIdList = new ArrayList<>();
    @Tag(tag=3) public List<Integer> skillLevelList = new ArrayList<>();
}
