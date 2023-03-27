package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SignInData {
    @Tag(tag=3) public Integer dayCount = null;
    @Tag(tag=1) public List<ItemParam> rewardItemList = new ArrayList<>();
}
