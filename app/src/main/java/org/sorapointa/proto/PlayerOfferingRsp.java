package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;
import org.sorapointa.proto.PlayerOfferingData.*;
import org.sorapointa.proto.PlayerOfferingData;

public class PlayerOfferingRsp {
    @Tag(tag=7) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public PlayerOfferingData offeringData = null;
}
