package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class SpiceActivityProcessFoodRsp {
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<ItemParam> specialFoodList = new ArrayList<>();
    @Tag(tag=1) public List<ItemParam> normalFoodList = new ArrayList<>();
}
