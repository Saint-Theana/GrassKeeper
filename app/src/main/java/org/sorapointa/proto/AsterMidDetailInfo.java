package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AsterMidDetailInfo {
    @Tag(tag=2) public List<AsterMidCampInfo> campList = new ArrayList<>();
    @Tag(tag=10) public Boolean isOpen = null;
    @Tag(tag=13) public Integer beginTime = null;
    @Tag(tag=4) public Integer collectCount = null;
}
