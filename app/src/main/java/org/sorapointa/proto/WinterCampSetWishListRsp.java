package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WinterCampSetWishListRsp {
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public List<Integer> itemIdList = new ArrayList<>();
}
