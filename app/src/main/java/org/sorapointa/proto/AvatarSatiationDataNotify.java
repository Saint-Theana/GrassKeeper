package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarSatiationData.*;
import org.sorapointa.proto.AvatarSatiationData;

public class AvatarSatiationDataNotify {
    @Tag(tag=6) public List<AvatarSatiationData> satiationDataList = new ArrayList<>();
}
