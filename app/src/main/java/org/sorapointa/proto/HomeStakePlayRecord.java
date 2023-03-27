package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeStakePlayRecord {
    @Tag(tag=10) public Integer timestamp = null;
    @Tag(tag=5) public List<HomeGroupPlayerInfo> engagedPlayerInfoList = new ArrayList<>();
}
