package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlossomChest {
    @Tag(tag=1) public Integer resin = null;
    @Tag(tag=2) public List<Integer> qualifyUidList = new ArrayList<>();
    @Tag(tag=3) public List<Integer> remainUidList = new ArrayList<>();
    @Tag(tag=4) public Integer deadTime = null;
    @Tag(tag=5) public Integer blossomRefreshType = null;
    @Tag(tag=6) public Integer refreshId = null;
}
