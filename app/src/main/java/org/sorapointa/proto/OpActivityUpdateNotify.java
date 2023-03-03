package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OpActivityInfo.*;
import org.sorapointa.proto.OpActivityInfo;

public class OpActivityUpdateNotify {
    @Tag(tag=6) public OpActivityInfo opActivityInfo = null;
}
