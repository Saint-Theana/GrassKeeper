package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FireworksReformData.*;
import org.sorapointa.proto.FireworksReformData;

public class FireworksReformDataNotify {
    @Tag(tag=6) public List<FireworksReformData> fireworksReformDataList = new ArrayList<>();
}
