package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlaceInfo.*;
import org.sorapointa.proto.PlaceInfo;

public class HandballInfo {
    @Tag(tag=11) public PlaceInfo ballPlaceInfo = null;
    @Tag(tag=7) public Boolean isHaveBall = null;
}
