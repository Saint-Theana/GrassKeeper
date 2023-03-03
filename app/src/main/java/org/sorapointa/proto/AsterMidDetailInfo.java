package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AsterMidCampInfo.*;
import org.sorapointa.proto.AsterMidCampInfo;

public class AsterMidDetailInfo {
    @Tag(tag=10) public Integer beginTime = null;
    @Tag(tag=7) public List<AsterMidCampInfo> campList = new ArrayList<>();
    @Tag(tag=4) public Boolean isOpen = null;
    @Tag(tag=11) public Integer collectCount = null;
}
