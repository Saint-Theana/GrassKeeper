package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class FishCastRodReq {
    @Tag(tag=14) public Integer baitId = null;
    @Tag(tag=4) public Integer rodId = null;
    @Tag(tag=7) public Integer rodEntityId = null;
    @Tag(tag=12) public Vector pos = null;
}
