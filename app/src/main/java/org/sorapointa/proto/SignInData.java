package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class SignInData {
    @Tag(tag=3) public Integer dayCount = null;
    @Tag(tag=1) public List<ItemParam> rewardItemList = new ArrayList<>();
}
