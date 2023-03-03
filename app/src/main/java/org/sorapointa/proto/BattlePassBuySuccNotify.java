package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class BattlePassBuySuccNotify {
    @Tag(tag=4) public Integer scheduleId = null;
    @Tag(tag=11) public Integer productPlayType = null;
    @Tag(tag=12) public Integer addPoint = null;
    @Tag(tag=9) public List<ItemParam> itemList = new ArrayList<>();
}
