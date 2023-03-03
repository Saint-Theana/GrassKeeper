package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomePlantFieldStatus.*;
import org.sorapointa.proto.HomePlantFieldStatus;

public class HomePlantSubFieldData {
    @Tag(tag=15) public List<Integer> entityIdList = new ArrayList<>();
    @Tag(tag=14) public Integer fieldStatus = null;
    @Tag(tag=9) public Integer homeGatherId = null;
    @Tag(tag=8) public Integer seedId = null;
    @Tag(tag=4,isFixed=true) public Integer endTime = null;
}
