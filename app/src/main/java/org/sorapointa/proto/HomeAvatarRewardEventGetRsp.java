package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class HomeAvatarRewardEventGetRsp {
    @Tag(tag=4) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer eventId = null;
}
