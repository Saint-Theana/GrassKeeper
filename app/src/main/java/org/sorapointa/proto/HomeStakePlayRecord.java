package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeGroupPlayerInfo.*;
import org.sorapointa.proto.HomeGroupPlayerInfo;

public class HomeStakePlayRecord {
    @Tag(tag=14) public List<HomeGroupPlayerInfo> engagedPlayerInfoList = new ArrayList<>();
    @Tag(tag=9) public Integer timestamp = null;
}
