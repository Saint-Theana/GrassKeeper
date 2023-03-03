package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGSettleOption.*;
import org.sorapointa.proto.GCGSettleOption;

public class GCGSettleOptionRsp {
    @Tag(tag=13) public Integer option = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
