package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerGiveFriendFlowerRsp {
    @Tag(tag=5) public List<Integer> limitFlowerList = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer scheduleId = null;
}
