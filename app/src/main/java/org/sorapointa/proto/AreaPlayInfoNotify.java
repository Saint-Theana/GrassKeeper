package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AreaPlayType.*;
import org.sorapointa.proto.AreaPlayType;

public class AreaPlayInfoNotify {
    @Tag(tag=14) public Integer detailPlayType = null;
    @Tag(tag=11) public Integer areaPlayType = null;
}
