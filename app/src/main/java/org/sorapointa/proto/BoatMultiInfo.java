package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IPLHKNLPPHD.*;
import org.sorapointa.proto.IPLHKNLPPHD;

public class BoatMultiInfo {
    @Tag(tag=14) public List<IPLHKNLPPHD> playerData = new ArrayList<>();
}
