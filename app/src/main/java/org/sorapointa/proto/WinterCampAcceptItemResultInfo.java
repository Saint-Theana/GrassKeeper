package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class WinterCampAcceptItemResultInfo {
    @Tag(tag=6) public Integer uid = null;
    @Tag(tag=9) public List<ItemParam> unacceptItemList = new ArrayList<>();
    @Tag(tag=11) public List<ItemParam> acceptItemList = new ArrayList<>();
}
