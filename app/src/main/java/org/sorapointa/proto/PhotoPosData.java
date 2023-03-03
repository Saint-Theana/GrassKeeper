package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class PhotoPosData {
    @Tag(tag=15) public Vector center = null;
    @Tag(tag=2) public Integer openTime = null;
    @Tag(tag=4) public Boolean isView = null;
    @Tag(tag=9) public Integer posId = null;
    @Tag(tag=6) public Boolean isOpen = null;
}
