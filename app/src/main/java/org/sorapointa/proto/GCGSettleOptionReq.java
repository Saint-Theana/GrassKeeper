package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGSettleOption.*;
import org.sorapointa.proto.GCGSettleOption;

public class GCGSettleOptionReq {
    @Tag(tag=5) public Integer option = null;
}
