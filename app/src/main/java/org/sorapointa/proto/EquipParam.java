package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EquipParam {
    @Tag(tag=1) public Integer itemId = null;
    @Tag(tag=2) public Integer itemNum = null;
    @Tag(tag=3) public Integer itemLevel = null;
    @Tag(tag=4) public Integer promoteLevel = null;
}
