package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class Reward {
    @Tag(tag=1) public Integer rewardId = null;
    @Tag(tag=2) public List<ItemParam> itemList = new ArrayList<>();
}
