package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WinterCampRecvItemData.*;
import org.sorapointa.proto.WinterCampRecvItemData;

public class WinterCampRecvItemNotify {
    @Tag(tag=14) public WinterCampRecvItemData recvItemData = null;
}
