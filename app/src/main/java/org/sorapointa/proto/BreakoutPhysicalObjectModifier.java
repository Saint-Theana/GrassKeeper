package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BreakoutPhysicalObjectModifier {
    @Tag(tag=1) public Integer type = null;
    @Tag(tag=2) public Integer id = null;
    @Tag(tag=3,isSigned=true) public Integer param1 = null;
    @Tag(tag=4,isSigned=true) public Integer param2 = null;
    @Tag(tag=5,isSigned=true) public Integer param3 = null;
    @Tag(tag=6,isSigned=true) public Integer param4 = null;
    @Tag(tag=7,isSigned=true) public Integer param5 = null;
    @Tag(tag=8,isSigned=true) public Integer param6 = null;
    @Tag(tag=9) public Boolean bool1 = null;
    @Tag(tag=10,isSigned=true) public Integer duration = null;
    @Tag(tag=11,isSigned=true) public Integer endTime = null;
    @Tag(tag=12) public Integer combo = null;
    @Tag(tag=13) public Integer peerId = null;
    @Tag(tag=14) public Integer skillType = null;
    @Tag(tag=15) public Integer level = null;
    @Tag(tag=16) public Integer choosePlayerCount = null;
}
