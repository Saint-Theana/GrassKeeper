package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeGroupPlayerInfo.*;
import org.sorapointa.proto.HomeGroupPlayerInfo;

public class HomeStakePlayRecord {
    @Tag(tag=10) public Integer timestamp = null;
    @Tag(tag=5) public List<HomeGroupPlayerInfo> engagedPlayerInfoList = new ArrayList<>();
}
