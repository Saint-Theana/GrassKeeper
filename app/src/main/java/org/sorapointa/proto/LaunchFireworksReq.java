package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FireworksLaunchSchemeData.*;
import org.sorapointa.proto.FireworksLaunchSchemeData;

public class LaunchFireworksReq {
    @Tag(tag=13) public FireworksLaunchSchemeData schemeData = null;
}
