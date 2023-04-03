package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SalvageEscortStopReason.*;
import org.sorapointa.proto.SalvageEscortStopReason;

public class SalvageEscortGallerySettleInfo {
    @Tag(tag=6) public Integer reason = null;
    @Tag(tag=8) public Integer timeRemain = null;
}
