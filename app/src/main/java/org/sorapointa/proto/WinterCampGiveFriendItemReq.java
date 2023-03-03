package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class WinterCampGiveFriendItemReq {
    @Tag(tag=12) public Integer uid = null;
    @Tag(tag=11) public List<ItemParam> itemList = new ArrayList<>();
}
