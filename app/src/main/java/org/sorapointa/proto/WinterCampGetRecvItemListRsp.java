package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WinterCampRecvItemData.*;
import org.sorapointa.proto.WinterCampRecvItemData;

public class WinterCampGetRecvItemListRsp {
    @Tag(tag=8) public List<WinterCampRecvItemData> recvItemDataList = new ArrayList<>();
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
