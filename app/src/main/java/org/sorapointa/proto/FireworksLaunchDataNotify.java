package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FireworksLaunchSchemeData.*;
import org.sorapointa.proto.FireworksLaunchSchemeData;

public class FireworksLaunchDataNotify {
    @Tag(tag=12) public List<FireworksLaunchSchemeData> schemeDataList = new ArrayList<>();
    @Tag(tag=4) public Integer lastUseSchemeId = null;
}
