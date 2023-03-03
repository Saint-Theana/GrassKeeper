package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class WinterCampGetCanGiveFriendItemRsp {
    @Tag(tag=8) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
