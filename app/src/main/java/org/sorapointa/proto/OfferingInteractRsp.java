package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerOfferingData.*;
import org.sorapointa.proto.PlayerOfferingData;

public class OfferingInteractRsp {
    @Tag(tag=11) public PlayerOfferingData offeringData = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
