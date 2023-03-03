package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RedPointData.*;
import org.sorapointa.proto.RedPointData;

public class UpdateRedPointNotify {
    @Tag(tag=12) public List<RedPointData> redPointList = new ArrayList<>();
}
