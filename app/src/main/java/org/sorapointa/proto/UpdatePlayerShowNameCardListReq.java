package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdatePlayerShowNameCardListReq {
    @Tag(tag=15) public List<Integer> showNameCardIdList = new ArrayList<>();
}
